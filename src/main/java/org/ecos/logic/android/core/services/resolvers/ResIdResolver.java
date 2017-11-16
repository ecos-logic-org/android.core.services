package org.ecos.logic.android.core.services.resolvers;

import android.support.annotation.IdRes;

import org.ecos.logic.android.core.exceptions.ResourceNotFoundException;
import org.ecos.logic.android.core.services.packages.PackageLocation;
import org.ecos.logic.android.core.services.resources.ResourceType;

public interface ResIdResolver {

    ResIdResolver setLocation(PackageLocation packageLocation, ResourceType resourceType);

    @IdRes
    int tryGetFrom(String resourceName) throws ResourceNotFoundException;
}