package Aufgaben_08;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecryptOutputStream extends FilterOutputStream {
    private byte[] key;
    private int pos;

    public DecryptOutputStream(OutputStream out, byte[] key) {
        super(out);
        this.key = key;
    }

    public void write(int b) throws IOException {
        super.write(b ^ next());
    }

    public void write(byte[] b, int offset, int count) throws IOException {
        for (int i = 0; i < count; i++)
            super.write(b[offset + i] ^ next());
    }

    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    private int next() {
        return key[pos++ % key.length];
    }
}
