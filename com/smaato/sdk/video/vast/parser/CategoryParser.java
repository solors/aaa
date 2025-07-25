package com.smaato.sdk.video.vast.parser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.model.Category;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class CategoryParser implements XmlClassParser<Category> {
    public static /* synthetic */ void lambda$parse$0(List list, Exception exc) {
        list.add(ParseError.buildFrom("Category", new Exception("Unable to parse Category code value", exc)));
    }

    @Override // com.smaato.sdk.video.vast.parser.XmlClassParser
    @NonNull
    public ParseResult<Category> parse(@NonNull RegistryXmlParser registryXmlParser) {
        Category category;
        final Category.Builder builder = new Category.Builder();
        final ArrayList arrayList = new ArrayList();
        registryXmlParser.parseStringAttribute(Category.AUTHORITY, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.z
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setAuthority((String) obj);
            }
        }, new C27744b(arrayList)).parseString(new Consumer() { // from class: com.smaato.sdk.video.vast.parser.a0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                builder.setCategoryCode((String) obj);
            }
        }, new Consumer() { // from class: com.smaato.sdk.video.vast.parser.b0
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                CategoryParser.lambda$parse$0(arrayList, (Exception) obj);
            }
        });
        try {
            category = builder.build();
        } catch (VastElementMissingException e) {
            arrayList.add(ParseError.buildFrom("Category", e));
            category = null;
        }
        return new ParseResult.Builder().setResult(category).setErrors(arrayList).build();
    }
}
