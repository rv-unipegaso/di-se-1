package it.unipegaso.business.bridge;

public abstract class Documento {

    protected PdfAPI pdfAPI;

    public Documento(PdfAPI pdfAPI) {
        this.pdfAPI = pdfAPI;
    }

    public abstract void salvaDocumento(String testo);

}
