package com.mbridge.msdk.video.dynview.p523h;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.video.dynview.DynamicBean;
import com.mbridge.msdk.video.dynview.ViewOption;
import com.mbridge.msdk.video.dynview.p516b.DataEnergize;
import com.mbridge.msdk.video.dynview.p516b.UIEnergize;
import com.mbridge.msdk.video.dynview.p517c.EnumError;
import com.mbridge.msdk.video.dynview.p519e.CreateAdCallback;
import com.mbridge.msdk.video.dynview.p519e.ViewInflaterCallback;
import com.mbridge.msdk.video.dynview.p528j.ViewOptionWrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.h.a */
/* loaded from: classes6.dex */
public final class MBridgeUI {

    /* renamed from: a */
    private static boolean f60286a = false;

    public MBridgeUI() {
    }

    public MBridgeUI(Context context, List<CampaignEx> list, ViewInflaterCallback viewInflaterCallback, Map<String, Object> map) {
        m48955a(new ViewOptionWrapper().m48884a(context, list), viewInflaterCallback, map);
    }

    /* renamed from: a */
    private void m48955a(ViewOption viewOption, final ViewInflaterCallback viewInflaterCallback, Map<String, Object> map) {
        View inflate;
        if (viewInflaterCallback == null) {
            return;
        }
        if (viewOption == null) {
            viewInflaterCallback.viewInflaterFail(EnumError.NOT_FOUND_VIEWOPTION);
        } else if (viewOption.m49032a() == null) {
            viewInflaterCallback.viewInflaterFail(EnumError.NOT_FOUND_CONTEXT);
        } else if (TextUtils.isEmpty(viewOption.m49031b())) {
            viewInflaterCallback.viewInflaterFail(EnumError.NOT_FOUND_LAYOUTNAME);
        } else {
            try {
                if (viewOption.m49021l() != null) {
                    inflate = DynamicViewCreator.getInstance().createDynamicView(new DyOption.Builder().campaignEx((viewOption.m49026g() == null || viewOption.m49026g().size() <= 0) ? null : viewOption.m49026g().get(0)).fileDirs(viewOption.m49021l()).dyAdType(DyAdType.REWARD).orientation(viewOption.m49028e()).templateType(viewOption.m49025h()).build());
                    if (inflate != null) {
                        f60286a = true;
                    } else {
                        f60286a = false;
                        inflate = LayoutInflater.from(viewOption.m49032a()).inflate(ResourceUtil.m51605a(viewOption.m49032a(), viewOption.m49031b(), "layout"), (ViewGroup) null);
                    }
                } else {
                    f60286a = false;
                    inflate = LayoutInflater.from(viewOption.m49032a()).inflate(ResourceUtil.m51605a(viewOption.m49032a(), viewOption.m49031b(), "layout"), (ViewGroup) null);
                }
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("is_dy_success", Boolean.valueOf(f60286a));
                UIEnergize.m49034a().m49033a(inflate, viewOption, map);
                DataEnergize.m49037a().m49036a(inflate, viewOption, map, new CreateAdCallback() { // from class: com.mbridge.msdk.video.dynview.h.a.1
                    @Override // com.mbridge.msdk.video.dynview.p519e.CreateAdCallback
                    /* renamed from: a */
                    public final void mo48954a(View view, List<View> list) {
                        DynamicBean dynamicBean = new DynamicBean();
                        dynamicBean.m49045a(view);
                        dynamicBean.m49044a(list);
                        dynamicBean.m49043a(MBridgeUI.f60286a);
                        viewInflaterCallback.viewInflaterSuccess(dynamicBean);
                    }

                    @Override // com.mbridge.msdk.video.dynview.p519e.CreateAdCallback
                    /* renamed from: a */
                    public final void mo48953a(EnumError enumError) {
                        viewInflaterCallback.viewInflaterFail(enumError);
                    }
                });
            } catch (Exception e) {
                SameLogTool.m51824b("MBridgeUI", e.getMessage());
                viewInflaterCallback.viewInflaterFail(EnumError.VIEW_CREATE_ERROR);
            }
        }
    }

    public MBridgeUI(ViewOption viewOption, ViewInflaterCallback viewInflaterCallback, Map<String, Object> map) {
        m48955a(viewOption, viewInflaterCallback, map);
    }
}
