package com.davemorrissey.labs.subscaleview.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

import java.io.IOException;
import java.io.InputStream;

public class UriInputProvider implements InputProvider {

    private ContentResolver resolver;
    public final Uri uri;

    public UriInputProvider(Context context, Uri uri) {
        this.resolver = context.getContentResolver();
        this.uri = uri;
    }

    @Override
    public InputStream openStream() throws IOException {
        return resolver.openInputStream(uri);
    }
}
