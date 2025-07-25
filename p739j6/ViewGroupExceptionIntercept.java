package p739j6;

/* renamed from: j6.c */
/* loaded from: classes6.dex */
public class ViewGroupExceptionIntercept implements IExceptionIntercept {
    @Override // p739j6.IExceptionIntercept
    /* renamed from: a */
    public boolean mo18522a(Exception exc) {
        StackTraceElement[] stackTrace = exc.getStackTrace();
        if (stackTrace.length == 0) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (stackTraceElement.getClassName().contains("ViewGroup") && stackTraceElement.getMethodName().equals("offsetRectBetweenParentAndChild")) {
                return true;
            }
        }
        return false;
    }
}
