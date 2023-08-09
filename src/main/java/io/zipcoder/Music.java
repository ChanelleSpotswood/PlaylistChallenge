package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer upIndex = 0;
        Integer downIndex = 0;
        Integer upNum = 0;
        Integer downNum = 0;



        // Set up the index
        for (int i = (playList.length - 1); i >= 0; i--){
            if (playList[i] == selection){
                upIndex = i;
                break;
            }
        }

        // Set down the index
        for (int i = 0; i < playList.length; i++)
            if (playList[i] == selection){
                downIndex = i;
                break;
            }

        // Set up the num
        if (startIndex == upIndex){
            return 0;
        }
        else if (startIndex > upIndex){
            upNum = upIndex - startIndex;
        }
        else {
            upNum = (playList.length - upIndex) + startIndex;
        }

        // Set down the num
        if (startIndex < downIndex){
            downNum = downIndex - startIndex;
        }
        else {
            downNum = (playList.length - downIndex) + startIndex;
        }

        if (upNum < downNum){
            return upNum;
        }
        else return downNum;

    }
}
