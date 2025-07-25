package p1048y;

import java.util.List;
import p001a0.DocumentData;
import p707i0.Keyframe;

/* renamed from: y.n */
/* loaded from: classes2.dex */
public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {
    public TextKeyframeAnimation(List<Keyframe<DocumentData>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p1048y.BaseKeyframeAnimation
    /* renamed from: p */
    public DocumentData mo1108i(Keyframe<DocumentData> keyframe, float f) {
        DocumentData documentData;
        if (f == 1.0f && (documentData = keyframe.f91832c) != null) {
            return documentData;
        }
        return keyframe.f91831b;
    }
}
