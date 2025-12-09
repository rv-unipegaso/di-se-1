package it.unipegaso.business.Bridge;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;

public class PdfBox20API implements PdfAPI {

    @Override
    public void creaPdf(String text, String outFile) {
        try(PDDocument doc = new PDDocument()) {

            PDPage page = new PDPage();
            doc.addPage(page);

            try(PDPageContentStream contents = new PDPageContentStream(doc, page)) {
                contents.beginText();
                contents.setFont(PDType1Font.HELVETICA, 16);
                contents.newLineAtOffset(100, 700);
                contents.showText(text);
                contents.endText();
            }

            doc.save(outFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
