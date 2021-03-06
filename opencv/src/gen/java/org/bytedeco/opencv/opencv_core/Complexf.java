// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \addtogroup core_basic
 *  \{
<p>
//////////////////////////////// Complex //////////////////////////////
<p>
/** \brief  A complex number class.
  <p>
  The template class is similar and compatible with std::complex, however it provides slightly
  more convenient access to the real and imaginary parts using through the simple field access, as opposite
  to std::complex::real() and std::complex::imag().
*/
@Name("cv::Complex<float>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Complexf extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Complexf(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Complexf(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Complexf position(long position) {
        return (Complexf)super.position(position);
    }


    /** default constructor */
    public Complexf() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Complexf( float _re, float _im/*=0*/ ) { super((Pointer)null); allocate(_re, _im); }
    private native void allocate( float _re, float _im/*=0*/ );
    public Complexf( float _re ) { super((Pointer)null); allocate(_re); }
    private native void allocate( float _re );

    /** conversion to another data type */
    /** conjugation */
    public native @ByVal Complexf conj();

    public native float re(); public native Complexf re(float re);
    public native float im(); public native Complexf im(float im); //< the real and the imaginary parts
}
