package org.ml;
import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.HistogramTrace;

import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.evaluation.Evaluation;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class LoanStatusPrediction {
	
	public static void main(String args[]) {
		System.out.println("Loan Status Prediction");
		try {
			Table bank_data = Table.read().csv("C:\\Users\\reddy\\eclipse-workspace\\org.ml\\src\\main\\java\\org\\ml\\train_dataset.csv");
			System.out.println(bank_data.shape());
			
			System.out.println(bank_data.structure());
			System.out.println(bank_data.first(5));
			
			Layout layout1 = Layout.builder().title("Distribution of ApplicantIncome").build();
			HistogramTrace trace1 = HistogramTrace.builder(bank_data.nCol("ApplicantIncome")).build();
			Plot.show(new Figure(layout1, trace1));
		
			Layout layout2 = Layout.builder().title("Distribution of Credit Histroy").build();
			HistogramTrace trace2 = HistogramTrace.builder(bank_data.nCol("Credit_History")).build();
			Plot.show(new Figure(layout2, trace2));
		
			Layout layout3 = Layout.builder().title("Distribution of LoanAmount").build();
			HistogramTrace trace3 = HistogramTrace.builder(bank_data.nCol("LoanAmount")).build();
			Plot.show(new Figure(layout3, trace3));
			
			Layout layout4 = Layout.builder().title("Distribution of Married Status").build();
			HistogramTrace trace4 = HistogramTrace.builder(bank_data.nCol("Married")).build();
			Plot.show(new Figure(layout4, trace4));
			
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
