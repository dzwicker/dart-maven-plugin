package com.google.dart.markers;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */

/**
 *
 */

import org.apache.maven.plugin.MojoExecutionException;
import org.sonatype.aether.artifact.Artifact;

/**
 * @author <a href="mailto:brianf@apache.org">Brian Fox</a>
 * @version $Id: MarkerHandler.java 728546 2008-12-21 22:56:51Z bentmann $
 */
public interface MarkerHandler {

	boolean isMarkerSet()
			throws MojoExecutionException;

	void setMarker()
			throws MojoExecutionException;

	boolean clearMarker()
			throws MojoExecutionException;

	boolean isMarkerOlder(Artifact artifact)
			throws MojoExecutionException;

	void setArtifact(Artifact artifact);

}
