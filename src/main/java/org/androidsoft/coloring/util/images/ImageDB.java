package org.androidsoft.coloring.util.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcelable;

public interface ImageDB {
    int size();
    Image get(int index);
    void attachObserver(Subject.Observer observer);

    interface Image extends Parcelable {
        Bitmap asPreviewImage(Context context, int maxWidth);
        boolean isVisible();
        Bitmap getImage(Context context);
    }
}
