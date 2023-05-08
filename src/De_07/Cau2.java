package De_07;


public class Cau2 {
    public static class VideoFile {
        int bitrate;
        int length;
        String name;
        public VideoFile(String name) { // default bitrate
            this.name = name;
            bitrate = 4194304;
        }
        public VideoFile(String name, int bitrate) {
            this.name = name;
            this.bitrate = bitrate;
            this.length = 0;
        }
        public VideoFile(String name, int bitrate, int length) {
            this.name=name;
            this.bitrate=bitrate;
            this.length=length;
        }
        public int getBitrate() {
            return bitrate;
        }
        public int getLength()
        { return length;    }
        public void setLength(int length) {
            this.length = length;
        }
        public int size() {
            return (int) (bitrate / 8.0 * length);
        }
    public static void main(String[] args) {
        
    }
}
}
