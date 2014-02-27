package user.Test;


import java.io.File;
import java.util.List;

import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryFinder;
import org.junit.Test;

public class AddSessionStories {

		@Test
		public void runURLLoadedStoriesAsJUnit() {
			Embedder embedder = new AddSessionEmbedder();
			
			List<String> storyPaths = 
				getStoryPathsFromProjectBinDir();
					
		    embedder.runStoriesAsPaths(storyPaths);
		}

		private List<String> getStoryPathsFromProjectBinDir() {
			
			StoryFinder finder = 
				new StoryFinder();
			
			File projectBinDir = 
				new File("./bin").getAbsoluteFile();
			
			String projectBinDirPath =
				projectBinDir.getPath();
						
			List<String> storyPaths =
				finder.findPaths(
					projectBinDirPath, "**/*.story", "");
			
			return storyPaths;
		}
	}


