/*
 * Licensed to scrutmydocs.org (the "Author") under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Author licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.scrutmydocs.webapp.test;

import java.io.IOException;

import org.junit.Test;
import org.scrutmydocs.webapp.configuration.ScrutMyDocsProperties;
import org.scrutmydocs.webapp.util.PropertyScanner;


public class PropertyScannerTest {

	@Test public void test_scan_for_home_dir() throws IOException {
		ScrutMyDocsProperties myprops = PropertyScanner.scanPropertyFile();
		System.out.println(myprops);
	}
	
}
