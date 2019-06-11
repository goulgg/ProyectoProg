package es.maestredam.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

/**
 *
 * @author Luismi
 */
public class ObjectOutputStream extends java.io.ObjectOutputStream implements Serializable{

    public ObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    public ObjectOutputStream() throws IOException, SecurityException {
    }
    
    @Override
    protected void writeStreamHeader() throws IOException{
        // No hacer nada.
    }
}