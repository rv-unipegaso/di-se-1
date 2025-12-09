package it.unipegaso.business.Bridge;

public abstract class Documento {

    protected PdfAPI pdfAPI;

    public Documento(PdfAPI pdfAPI) {
        this.pdfAPI = pdfAPI;
    }

    public abstract void salvaDocumento(String testo);
}
