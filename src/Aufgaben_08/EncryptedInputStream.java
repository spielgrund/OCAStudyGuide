package Aufgaben_08;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EncryptedInputStream extends FilterInputStream {
    private byte[] key;
    private int pos;

    public EncryptedInputStream(InputStream in, byte[] key) {
        super(in);
        this.key = key;
    }



    public int read() throws IOException {
        int b = super.read();
        return b ^ next();
    }

    public int read(byte[] b, int offset, int count) throws IOException {
        int n = super.read(b, offset, count);
        int last = offset + n;
        for (int i = offset; i < last; i++) {
            b[i] = (byte) (b[i] ^ next());
        }
        return n;
    }

    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    private int next() {
        return key[pos++ % key.length];
    }
}
