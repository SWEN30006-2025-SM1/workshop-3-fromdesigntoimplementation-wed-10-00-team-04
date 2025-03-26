public class File extends Submission{
    private static Date createdDate;
    private static String fileData;
    private static String fileName;


    public static String content() {
        return fileData;
    }

    public static int fileSize() {
        return fileData.length();
    }

    public static String fileType() {
        return fileData;
    }

}
