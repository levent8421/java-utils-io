package com.levent8421.util.io;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Create By Levent at 2020/8/5 15:23
 * Connection
 * Base Connection
 *
 * @author levent
 */
public interface Connection {
    /**
     * Get The Input Stream
     *
     * @return stream
     */
    InputStream getInputStream();

    /**
     * Get the output stream
     *
     * @return stream
     */
    OutputStream getOutputStream();

    /**
     * Close connection
     */
    void close();
}
