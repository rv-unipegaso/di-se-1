package it.unipegaso.business.bridge;

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
            tempFile = File.createTempFile("fattura_", ".pdf");
            String path = tempFile.getAbsolutePath();
            System.out.println(path);
            pdfAPI.creaPdf(testo, path);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
