package org.ecos.logic.android.core.services.resolvers;

import android.content.Context;

import org.ecos.logic.android.core.exceptions.ResourceNotFoundException;
import org.ecos.logic.android.core.services.packages.PackageLocation;
import org.ecos.logic.android.core.services.resources.ResourceType;

public class ResIdResolverImpl implements ResIdResolver {
    private Context mContext;

    private String mResourceTypeAsString;
    private String mPackageNameAsString;

    public ResIdResolverImpl(ContextResolver contextResolver) {
        mContext = contextResolver.getContext();
    }

    @Override
    public ResIdResolver setLocation(PackageLocation packageLocation, ResourceType resourceType) {
        mResourceTypeAsString = resourceType.getResourceTypeAsString();
        mPackageNameAsString = packageLocation.getPackageLocationAsString();

        return this;
    }

    @Override
    public int tryGetFrom(String resourceName) throws ResourceNotFoundException {
        resourceName = resourceName.toLowerCase();

        int identifier = mContext.
            getResources().
            getIdentifier(resourceName, mResourceTypeAsString, mPackageNameAsString);

        if (identifier == 0)
            throw new ResourceNotFoundException();

        return identifier;
    }
}
