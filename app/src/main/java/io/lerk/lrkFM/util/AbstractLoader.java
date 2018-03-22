package io.lerk.lrkFM.util;

import android.support.annotation.Nullable;

import java.util.ArrayList;

import io.lerk.lrkFM.entities.FMFile;
import io.lerk.lrkFM.exceptions.EmptyDirectoryException;
import io.lerk.lrkFM.exceptions.NoAccessException;

/**
 * Because I like to rant about <pre>ILoader</pre> 'nsuch.
 *
 * @author Lukas Fülling (lukas@k40s.net)
 */
public abstract class AbstractLoader {

    abstract ArrayList<FMFile> loadLocationFiles() throws NoAccessException, EmptyDirectoryException;

    abstract protected ArrayList<FMFile> loadLocationFilesForPath(@Nullable String parent) throws NoAccessException, EmptyDirectoryException;


}
