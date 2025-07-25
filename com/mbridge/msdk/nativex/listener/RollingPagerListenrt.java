package com.mbridge.msdk.nativex.listener;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.ReportController;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import com.mbridge.msdk.foundation.same.report.p452d.C22011d;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public class RollingPagerListenrt implements ViewPager.OnPageChangeListener {
    private NativeListener.FilpListener FilpListening;
    private List<Frame> frames;
    private List<Integer> list = new ArrayList();
    private ReportController reportController;
    private String unit_id;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        reportRollBC(i);
    }

    public void reportRollBC(int i) {
        try {
            NativeListener.FilpListener filpListener = this.FilpListening;
            if (filpListener != null) {
                filpListener.filpEvent(i);
            }
            if (this.list.contains(Integer.valueOf(i))) {
                return;
            }
            this.list.add(Integer.valueOf(i));
            Frame frame = this.frames.get(i);
            List<CampaignEx> campaigns = frame.getCampaigns();
            if (campaigns != null && !campaigns.isEmpty()) {
                CampaignEx campaignEx = campaigns.get(0);
                StringBuilder sb2 = new StringBuilder();
                for (int i2 = 0; i2 < campaigns.size(); i2++) {
                    campaignEx = campaigns.get(i2);
                    if (i2 == campaigns.size() - 1) {
                        sb2.append(campaignEx.getId());
                    } else {
                        sb2.append(campaignEx.getId() + ",");
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("rid", campaignEx.getRequestId());
                hashMap.put("rid_n", campaignEx.getRequestIdNotice());
                hashMap.put("frame_id", (i + 1) + "");
                hashMap.put("template", Integer.valueOf(frame.getTemplate()));
                hashMap.put("cids", sb2.toString());
                hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unit_id);
                C22011d.m52050a().m52037a(ReportUtil.m51953a("2000005", hashMap));
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("RollingPagerListener", th.getMessage());
        }
    }

    public void setCampList(List<Frame> list, Context context, String str) {
        this.frames = list;
        this.reportController = new ReportController(context, 2);
        this.unit_id = str;
        this.list.clear();
        reportRollBC(0);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        this.FilpListening = filpListener;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }
}
