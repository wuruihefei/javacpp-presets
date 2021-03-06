// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;
		/* For `struct timeval'.  */

/* Structure which says how much of each resource has been used.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class rusage extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rusage() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rusage(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rusage(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rusage position(long position) {
        return (rusage)super.position(position);
    }

    /* Total amount of user time used.  */
    public native @ByRef timeval ru_utime(); public native rusage ru_utime(timeval ru_utime);
    /* Total amount of system time used.  */
    public native @ByRef timeval ru_stime(); public native rusage ru_stime(timeval ru_stime);
    /* Maximum resident set size (in kilobytes).  */
    public native long ru_maxrss(); public native rusage ru_maxrss(long ru_maxrss);
    /* Amount of sharing of text segment memory
       with other processes (kilobyte-seconds).  */
    public native long ru_ixrss(); public native rusage ru_ixrss(long ru_ixrss);
    /* Amount of data segment memory used (kilobyte-seconds).  */
    public native long ru_idrss(); public native rusage ru_idrss(long ru_idrss);
    /* Amount of stack memory used (kilobyte-seconds).  */
    public native long ru_isrss(); public native rusage ru_isrss(long ru_isrss);
    /* Number of soft page faults (i.e. those serviced by reclaiming
       a page from the list of pages awaiting reallocation.  */
    public native long ru_minflt(); public native rusage ru_minflt(long ru_minflt);
    /* Number of hard page faults (i.e. those that required I/O).  */
    public native long ru_majflt(); public native rusage ru_majflt(long ru_majflt);
    /* Number of times a process was swapped out of physical memory.  */
    public native long ru_nswap(); public native rusage ru_nswap(long ru_nswap);
    /* Number of input operations via the file system.  Note: This
       and `ru_oublock' do not include operations with the cache.  */
    public native long ru_inblock(); public native rusage ru_inblock(long ru_inblock);
    /* Number of output operations via the file system.  */
    public native long ru_oublock(); public native rusage ru_oublock(long ru_oublock);
    /* Number of IPC messages sent.  */
    public native long ru_msgsnd(); public native rusage ru_msgsnd(long ru_msgsnd);
    /* Number of IPC messages received.  */
    public native long ru_msgrcv(); public native rusage ru_msgrcv(long ru_msgrcv);
    /* Number of signals delivered.  */
    public native long ru_nsignals(); public native rusage ru_nsignals(long ru_nsignals);
    /* Number of voluntary context switches, i.e. because the process
       gave up the process before it had to (usually to wait for some
       resource to be available).  */
    public native long ru_nvcsw(); public native rusage ru_nvcsw(long ru_nvcsw);
    /* Number of involuntary context switches, i.e. a higher priority process
       became runnable or the current process used up its time slice.  */
    public native long ru_nivcsw(); public native rusage ru_nivcsw(long ru_nivcsw);
  }
