// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif /* Py_LIMITED_API */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class freefunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    freefunc(Pointer p) { super(p); }
    protected freefunc() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0);
}
