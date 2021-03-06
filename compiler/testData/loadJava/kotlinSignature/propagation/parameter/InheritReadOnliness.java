package test;

import org.jetbrains.annotations.NotNull;
import jet.runtime.typeinfo.KotlinSignature;
import org.jetbrains.jet.jvm.compiler.annotation.ExpectLoadError;
import java.util.*;

public interface InheritReadOnliness {

    public interface Super {
        @KotlinSignature("fun foo(p: List<String>)")
        void foo(List<String> p);
    }

    public interface Sub extends Super {
        void foo(List<String> p);
    }
}
