public class PDFDownloader {
    public static String downloadPDF(String articleId) {
        System.out.println("Downloading PDF for article: " + articleId);
        return "PDF for article " + articleId + " has been downloaded.";
    }
}
