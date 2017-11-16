package org.ecos.logic.android.core.services.packages;

import android.content.Context;

import org.ecos.logic.android.core.services.resolvers.ApplicationContextResolver;

public final class InAppPackages implements PackageLocation {
    private Context mApplicationContext;

    public InAppPackages(ApplicationContextResolver applicationContextResolver) {
        mApplicationContext = applicationContextResolver.getApplicationContext();
    }

    @Override
    public String getPackageLocationAsString() {
        return mApplicationContext.getPackageName();
    }
}
