// Generated by jextract

package azahriah.nemhibas.jdktest.natives.windows.kernel32;

import java.lang.invoke.MethodHandle;

import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$0 {

    static final FunctionDescriptor CloseHandle$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle CloseHandle$MH = RuntimeHelper.downcallHandle(
        Kernel32.LIBRARIES, "CloseHandle",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$0.CloseHandle$FUNC, false
    );
    static final FunctionDescriptor OpenProcess$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_INT,
        C_LONG
    );
    static final MethodHandle OpenProcess$MH = RuntimeHelper.downcallHandle(
        Kernel32.LIBRARIES, "OpenProcess",
        "(III)Ljdk/incubator/foreign/MemoryAddress;",
        constants$0.OpenProcess$FUNC, false
    );
    static final FunctionDescriptor VirtualQueryEx$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle VirtualQueryEx$MH = RuntimeHelper.downcallHandle(
        Kernel32.LIBRARIES, "VirtualQueryEx",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$0.VirtualQueryEx$FUNC, false
    );
    static final FunctionDescriptor ReadProcessMemory$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle ReadProcessMemory$MH = RuntimeHelper.downcallHandle(
        Kernel32.LIBRARIES, "ReadProcessMemory",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$0.ReadProcessMemory$FUNC, false
    );
}


