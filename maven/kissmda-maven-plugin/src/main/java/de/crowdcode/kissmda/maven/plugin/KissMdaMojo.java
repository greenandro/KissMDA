/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package de.crowdcode.kissmda.maven.plugin;

import java.util.logging.Logger;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import de.crowdcode.kissmda.core.Context;
import de.crowdcode.kissmda.core.Transformer;
import de.crowdcode.kissmda.core.TransformerException;

/**
 * KissMDA Mojo.
 * 
 * @goal genenerate
 * @phase generate-sources
 * 
 * @author Lofi Dewanto
 * @version 1.0.0
 * @since 1.0.0
 */
public class KissMdaMojo extends AbstractMojo {

	private static final Logger logger = Logger.getLogger(KissMdaMojo.class
			.getName());

	private Transformer transformer;
	private Context context;

	/**
	 * Execute.
	 * 
	 * @throws MojoExecutionException
	 */
	@Override
	public void execute() throws MojoExecutionException {
		// We need to execute the transformer, check what transformer should we
		// start
		try {
			logger.info("Start the transformation...");
			transformer.transform(context);
			logger.info("Stop the transformation...");
		} catch (TransformerException e) {
			throw new MojoExecutionException("Error transform the model: "
					+ e.getLocalizedMessage(), e);
		}
	}
}
