package com.bellyforex.tradeportea.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: dateTimeC.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¨\u0006\u0003"}, d2 = {"convert", "", "dateTime", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /storage/emulated/0/Documents/jadec/sources/com.bellyforex.tradeportea/dex-files/0.dex */
public final class DateTimeCKt {
    public static final String convert(String str) {
        if (str != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, d MMM yyyy");
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("h:mm a");
            String format = simpleDateFormat2.format(new Date());
            Date parse = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse);
            String format2 = simpleDateFormat2.format(parse);
            Date parse2 = simpleDateFormat.parse(str);
            Intrinsics.checkNotNull(parse2);
            String format3 = simpleDateFormat3.format(parse2);
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, -1);
            return Intrinsics.areEqual(format2, format) ? "Today " + format3 : Intrinsics.areEqual(format2, simpleDateFormat2.format(calendar.getTime())) ? "Yesterday " + format3 : format2 + " " + format3;
        }
        return "Not Set";
    }
}
