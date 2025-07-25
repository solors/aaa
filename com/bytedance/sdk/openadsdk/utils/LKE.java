package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.C8837VW;
import java.util.List;

/* loaded from: classes3.dex */
public class LKE {

    /* renamed from: com.bytedance.sdk.openadsdk.utils.LKE$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC9508IL {
        /* renamed from: IL */
        void mo82624IL();

        /* renamed from: bg */
        void mo82623bg();

        /* renamed from: bg */
        void mo82622bg(View view, boolean z);

        /* renamed from: bg */
        void mo82621bg(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.LKE$bg */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC9509bg implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: IL */
        final /* synthetic */ ViewGroup f21163IL;

        /* renamed from: bg */
        View f21164bg = null;

        ViewTreeObserver$OnGlobalLayoutListenerC9509bg(ViewGroup viewGroup) {
            this.f21163IL = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                InterfaceC9508IL interfaceC9508IL = (InterfaceC9508IL) this.f21163IL.getTag(520093765);
                if (this.f21164bg != null) {
                    Rect rect = new Rect();
                    this.f21164bg.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    this.f21163IL.getGlobalVisibleRect(rect2);
                    if (rect.contains(rect2)) {
                        if (interfaceC9508IL != null) {
                            interfaceC9508IL.mo82622bg(this.f21163IL, false);
                        }
                        this.f21163IL.setTag(520093763, Boolean.FALSE);
                        return;
                    }
                    if (interfaceC9508IL != null) {
                        interfaceC9508IL.mo82622bg(this.f21163IL, true);
                    }
                    this.f21163IL.setTag(520093763, Boolean.TRUE);
                    return;
                }
                ViewGroup viewGroup = this.f21163IL;
                LKE.m82628IL(viewGroup, interfaceC9508IL, (Integer) viewGroup.getTag(520093766));
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.f21163IL.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static void m82628IL(View view, InterfaceC9508IL interfaceC9508IL, Integer num) {
        if (interfaceC9508IL == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        if (m82627bg(view, num.intValue())) {
            interfaceC9508IL.mo82622bg(view, true);
        }
    }

    /* renamed from: bg */
    public static void m82625bg(final ViewGroup viewGroup, boolean z, int i, InterfaceC9508IL interfaceC9508IL, List<ViewGroup> list) {
        viewGroup.setTag(520093765, interfaceC9508IL);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final ViewTreeObserver$OnGlobalLayoutListenerC9509bg viewTreeObserver$OnGlobalLayoutListenerC9509bg = new ViewTreeObserver$OnGlobalLayoutListenerC9509bg(viewGroup);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        ViewTreeObserver$OnGlobalLayoutListenerC9509bg.this.f21164bg = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        ViewTreeObserver$OnGlobalLayoutListenerC9509bg.this.f21164bg = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC9509bg);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        ViewGroup viewGroup2 = viewGroup;
                        LKE.m82628IL(viewGroup2, (InterfaceC9508IL) viewGroup.getTag(520093765), (Integer) viewGroup2.getTag(520093766));
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z2) {
                try {
                    InterfaceC9508IL interfaceC9508IL2 = (InterfaceC9508IL) viewGroup.getTag(520093765);
                    if (interfaceC9508IL2 != null) {
                        interfaceC9508IL2.mo82621bg(z2);
                        ViewGroup viewGroup2 = viewGroup;
                        LKE.m82628IL(viewGroup2, interfaceC9508IL2, (Integer) viewGroup2.getTag(520093766));
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.LKE.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                InterfaceC9508IL interfaceC9508IL2 = (InterfaceC9508IL) viewGroup.getTag(520093765);
                if (interfaceC9508IL2 != null) {
                    interfaceC9508IL2.mo82623bg();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                InterfaceC9508IL interfaceC9508IL2 = (InterfaceC9508IL) viewGroup.getTag(520093765);
                if (interfaceC9508IL2 != null) {
                    interfaceC9508IL2.mo82624IL();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    /* renamed from: bg */
    private static boolean m82627bg(View view, int i) {
        return C8837VW.m84744bg(view, 20, i);
    }
}
