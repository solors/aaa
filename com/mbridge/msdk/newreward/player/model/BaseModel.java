package com.mbridge.msdk.newreward.player.model;

import com.mbridge.msdk.newreward.function.command.CommandManager;
import com.mbridge.msdk.newreward.function.command.CommandType;
import com.mbridge.msdk.newreward.player.imodel.IModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectModel;
import com.mbridge.msdk.newreward.player.redirect.RedirectType;

/* loaded from: classes6.dex */
public abstract class BaseModel implements IModel {
    protected CommandManager commandManager;

    public BaseModel(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IModel
    public boolean eventClickUrl(RedirectModel redirectModel) {
        if (this.commandManager != null) {
            sendDirectEvent(redirectModel.setRedirectType(RedirectType.CLICK_URL));
            return true;
        }
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.imodel.IModel
    public void eventNoticeUrl(RedirectModel redirectModel, int i) {
        if (this.commandManager != null) {
            redirectModel.setRedirectType(RedirectType.NOTICE_URL);
            CommandManager commandManager = this.commandManager;
            commandManager.m50453f(commandManager.m50468a("campaign_redirect", redirectModel, "click_scenario", Integer.valueOf(i)), CommandType.CAMPAIGN_REDIRECT);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void sendDirectEvent(RedirectModel redirectModel) {
        CommandManager commandManager = this.commandManager;
        commandManager.m50453f(commandManager.m50468a("campaign_redirect", redirectModel), CommandType.CAMPAIGN_REDIRECT);
    }
}
