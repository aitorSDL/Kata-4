package kata4.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "C:\\Users\\usuario\\Desktop\\emails.txt";
        List<Mail>  mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = null;
        new HistogramDisplay(histogram).execute(); 
    }
}
