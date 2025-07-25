package com.facebook.gamingservices.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.facebook.gamingservices.TournamentConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TournamentShareDialogURIBuilder.kt */
@Metadata
/* loaded from: classes3.dex */
public final class TournamentShareDialogURIBuilder {
    @NotNull
    public static final TournamentShareDialogURIBuilder INSTANCE = new TournamentShareDialogURIBuilder();
    @NotNull
    public static final String authority = "fb.gg";
    @NotNull

    /* renamed from: me */
    public static final String f24704me = "me";
    @NotNull
    public static final String scheme = "https";
    @NotNull
    public static final String tournament = "instant_tournament";

    private TournamentShareDialogURIBuilder() {
    }

    @NotNull
    public final Bundle bundleForCreating$facebook_gamingservices_release(@NotNull TournamentConfig config, @NotNull Number score, @NotNull String appID) {
        Instant endTime;
        long epochSecond;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(appID, "appID");
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", appID);
        bundle.putString("score", score.toString());
        TournamentSortOrder sortOrder = config.getSortOrder();
        if (sortOrder != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = config.getScoreType();
        if (scoreType != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = config.getTitle();
        if (title != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = config.getPayload();
        if (payload != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        if (Build.VERSION.SDK_INT >= 26 && (endTime = config.getEndTime()) != null) {
            epochSecond = endTime.getEpochSecond();
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_END_TIME, String.valueOf((int) epochSecond));
        }
        return bundle;
    }

    @NotNull
    public final Bundle bundleForUpdating$facebook_gamingservices_release(@NotNull String tournamentID, @NotNull Number score, @NotNull String appID) {
        Intrinsics.checkNotNullParameter(tournamentID, "tournamentID");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(appID, "appID");
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", appID);
        bundle.putString("score", score.toString());
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID);
        return bundle;
    }

    @NotNull
    public final Uri uriForCreating$facebook_gamingservices_release(@NotNull TournamentConfig config, @NotNull Number score, @NotNull String appID) {
        String instant;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(appID, "appID");
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("fb.gg").appendPath(f24704me).appendPath(tournament).appendPath(appID).appendQueryParameter("score", score.toString());
        Instant endTime = config.getEndTime();
        if (endTime != null) {
            instant = endTime.toString();
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_END_TIME, instant);
        }
        TournamentSortOrder sortOrder = config.getSortOrder();
        if (sortOrder != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = config.getScoreType();
        if (scoreType != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = config.getTitle();
        if (title != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = config.getPayload();
        if (payload != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        Uri build = appendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    @NotNull
    public final Uri uriForUpdating$facebook_gamingservices_release(@NotNull String tournamentID, @NotNull Number score, @NotNull String appID) {
        Intrinsics.checkNotNullParameter(tournamentID, "tournamentID");
        Intrinsics.checkNotNullParameter(score, "score");
        Intrinsics.checkNotNullParameter(appID, "appID");
        Uri build = new Uri.Builder().scheme("https").authority("fb.gg").appendPath(f24704me).appendPath(tournament).appendPath(appID).appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID).appendQueryParameter("score", score.toString()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n        .scheme(scheme)\n        .authority(authority)\n        .appendPath(me)\n        .appendPath(tournament)\n        .appendPath(appID)\n        .appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, tournamentID)\n        .appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE, score.toString())\n        .build()");
        return build;
    }
}
