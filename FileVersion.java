public class FileVersion {
    public static int findLatestVersion(String[] S, int n) {
      if(n==0){
      return -1;
      }
      int maxversion =Integer.MIN_VALUE;
      for(String filename:S){
        if (filename.startsWith("File_")) {
        int sp = Integer.parseInt(filename.split("_")[1]);
          maxversion = Math.max(sp, maxversion);
        }
      }
      return maxversion;
    }
    public static void main(String[] args) {
        String[] input1 = {"File_5", "File_3", "File_2", "File_1"};
        int input2 = 4;
        System.out.println(findLatestVersion(input1, input2));
    }
}
