public class PDFDownloader {
    public static String downloadPDF(String articleId) {
       String sanitizedId = articleId.replaceAll("[^a-zA-Z0-9]", "_");
        System.out.println("Downloading PDF for article: " + articleId);
        return "PDF for article " + articleId + " has been downloaded.";
    }
}
