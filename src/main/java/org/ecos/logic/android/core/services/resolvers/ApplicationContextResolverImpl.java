package org.ecos.logic.android.core.services.resolvers;

import android.content.Context;

public class ApplicationContextResolverImpl implements ApplicationContextResolver {
    private Context mApplicationContext;

    public ApplicationContextResolverImpl(Context applicationContext) {
        mApplicationContext = applicationContext;
    }

    @Override
    public Context getApplicationContext() {
        return mApplicationContext;
    }
}