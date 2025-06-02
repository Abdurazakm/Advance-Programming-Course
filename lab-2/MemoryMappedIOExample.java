import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MemoryMappedIOExample {
    public static void main(String[] args) throws Exception {
        RandomAccessFile file = new RandomAccessFile("example.txt", "rw");
        FileChannel channel = file.getChannel();

        // Map the file into memory
        MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, channel.size());

        // Write to the buffer
        buffer.putChar('H');
        buffer.putChar('e');
        buffer.putChar('l');
        buffer.putChar('l');
        buffer.putChar('o');

        // Flush changes to disk
        buffer.force();

        // Read from the buffer
        buffer.position(0);
        while (buffer.hasRemaining()) {
            System.out.print(buffer.getChar());
        }

        // Unmap the buffer
        channel.close();
        file.close();
    }
}
