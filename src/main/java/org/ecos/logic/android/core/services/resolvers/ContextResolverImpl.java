package org.ecos.logic.android.core.services.resolvers;

import android.content.Context;

public class ContextResolverImpl implements ContextResolver {
    private Context mContext;

    public ContextResolverImpl(Context context) {
        mContext = context;
    }

    @Override
    public Context getContext() {
        return mContext;
    }
}