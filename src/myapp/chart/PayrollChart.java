/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myapp.chart;

/**
 *
 * @author admin
 */

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.chart.ui.RectangleEdge;
import org.jfree.chart.ui.RectangleInsets;

import javax.swing.*;
import java.awt.*;

public class PayrollChart {

    public static JPanel createHalfDonut(double takeHome, double mandatory, double late) {
        // Dataset
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Take Home Pay", takeHome);
        dataset.setValue("Mandatory Deductions", mandatory);
        dataset.setValue("Late", late);

        // Donut chart
        JFreeChart chart = ChartFactory.createRingChart(
                null, dataset, true, false, false
        );

        RingPlot plot = (RingPlot) chart.getPlot();
        plot.setSectionDepth(0.40);    
        plot.setSimpleLabels(true);
        plot.setSeparatorsVisible(false);
        plot.setShadowPaint(null);
        plot.setBackgroundPaint(null);
        plot.setOutlineVisible(false);

        // Rotate so the top arc looks nice
        plot.setStartAngle(90);          

        plot.setSectionPaint("Take Home Pay", new Color(102,153,255));
        plot.setSectionPaint("Mandatory Deductions", new Color(255,102,102));
        plot.setSectionPaint("Late", new Color(255,204,102));
        
        LegendTitle legend = chart.getLegend();
        if (legend != null) legend.setPosition(RectangleEdge.TOP);
        chart.setBackgroundPaint(null);
        chart.setPadding(new RectangleInsets(0,0,0,0));
        
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(200, 380));
        panel.setMouseWheelEnabled(true);
        return panel;
    }
}