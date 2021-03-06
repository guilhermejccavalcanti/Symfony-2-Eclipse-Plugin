/*******************************************************************************
 * This file is part of the Symfony eclipse plugin.
 * 
 * (c) Robert Gruendler <r.gruendler@gmail.com>
 * 
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.dubture.symfony.index.dao;

import java.sql.Connection;

import org.eclipse.core.runtime.IPath;

import com.dubture.symfony.index.handler.IResourceHandler;

public interface IResourceDao extends IDao {

	void insert(Connection connection, String path, String type, String prefix, IPath fullPath) throws Exception;

	void findResource(IPath path, IResourceHandler iResourceHandler);
	
}
