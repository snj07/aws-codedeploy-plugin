package com.amazonaws.codedeploy;

import java.io.PrintStream;

import com.amazonaws.regions.Regions;

public class Test1 {
	public static void main(String[] args) {

		String s3bucket = "";
		String s3prefix = "";

		String githubRepository = null;
		String githubCommitId = null;
		String applicationName = "DemoApp";
		String deploymentGroupName = "";
		String deploymentConfig = null;
		Long pollingTimeoutSec = 200L;
		Long pollingFreqSec = 20L;
		boolean deploymentGroupAppspec = true;
		boolean waitForCompletion = true;
		String externalId = "";
		String iamRoleArn = "";
		String region = Regions.AP_NORTHEAST_1.getName();
		String includes = "";
		String excludes = "";
		String subdirectory = "";
		String proxyHost = null;
		int proxyPort = 0;

		String awsAccessKey = "";
		String awsSecretKey = "";
		String credentials = "";
		String deploymentMethod = "";
		String versionFileName = "";

		AWSCodeDeployTest acdt = new AWSCodeDeployTest(s3bucket, s3prefix, githubRepository, githubCommitId,
				applicationName, deploymentGroupName, deploymentConfig, region, deploymentGroupAppspec,
				waitForCompletion, pollingTimeoutSec, pollingFreqSec, credentials, versionFileName, deploymentMethod,
				awsAccessKey, awsSecretKey, iamRoleArn, externalId, includes, proxyHost, proxyPort, excludes,
				subdirectory);
	}
}
