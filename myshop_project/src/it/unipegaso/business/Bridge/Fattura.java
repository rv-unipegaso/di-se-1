package it.unipegaso.business.Bridge;

import java.io.File;
import java.io.IOException;

public class Fattura extends Documento {

    public Fattura(PdfAPI pdfAPI) {
        super(pdfAPI);
    }

    @Override
    public void salvaDocumento(String testo) {

        File tempFile = null;
        try {
            tempFile = File.createTempFile("fattura_",".pdf");
            System.out.println(tempFile.getAbsolutePath());
            pdfAPI.creaPdf(testo, tempFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
