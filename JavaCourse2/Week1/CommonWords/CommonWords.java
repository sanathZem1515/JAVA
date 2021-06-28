
/**
 * Count common words in Shakespeare's works
 * 
 * @author Duke Software Team
 * @version 1.0
 */

import edu.duke.*;

public class CommonWords
{
    public String[] getCommon(){
		FileResource resource = new FileResource("data/common.txt");
		String[] common = new String[20];
		int index = 0;
		for(String s : resource.words()){
			common[index] = s;
			index += 1;
		}
		return common;
	}

	public int indexOf(String[] list, String word)
	{
	    for (int k=0; k<list.length; k++)
	    {
	        if (list[k].equals(word))
	        {
	               return k;
	        }
	    }
	    return -1;
	}
	
	public void countWords(FileResource resource, String[] common, int[] counts)
	{
		for(String word : resource.words())
		{
			word = word.toLowerCase();
			int index = indexOf(common,word);
			if (index != -1) {
				counts[index] += 1;
			}
		}
	}

	public void countWordLengths(FileResource resource,int[] count)
	{
		ArrayList<String>[] ar = new ArrayList[31];
		for(int i=0;i<n;i++)
			ar[i]=new ArrayList<String>();

		for(String word : resource.words())
		{
			int len = word.length();
			if(len<30)
			{
				ar[len].add(word);
				count[len]++;
			}
			else
			{
				ar[30].add(word);
				count[30]++;
			}

		}

		for(int i=0;i<31;i++)
		{
			if(count[i]!=0)
			{
				System.out.print(count[i]+ " words of length"+ (i+1)+": ");
				for(int j=0;j<ar[i].size();j++)
				{
					System.out.print(ar[i].get(j)+" ");
				}
				System.out.println();
			}
		}
	}

	public void testCountWordLengths()
	{
		String[] plays = {"smallHamlet.txt"};
//		String[] common = getCommon();
//		int[] counts = new int[common.length];
		for(int k=0; k < plays.length; k++)
		{
			FileResource resource = new FileResource("data/" + plays[k]);
			countWordLengths(resource,new int[31]);
//			System.out.println("done with " + plays[k]);
		}
	}
	void countShakespeare()
	{
	    String[] plays = {"small.txt"};
		String[] common = getCommon();
		int[] counts = new int[common.length];
		for(int k=0; k < plays.length; k++){
			FileResource resource = new FileResource("data/" + plays[k]);
			countWords(resource,common,counts);
			System.out.println("done with " + plays[k]);
		}
		
		for(int k=0; k < common.length; k++){
			System.out.println(common[k] + "\t" + counts[k]);
		}
	}
	public static void main()
	{
		CommonWords c = new CommonWords();
	}

}
