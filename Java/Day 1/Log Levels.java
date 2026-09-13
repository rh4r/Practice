/* This shit took me the entire hour i delegated to learning java. 
        You know, this is kinda a larger gap then the previous lessons, moving onto string manipulation but it's whatever i suppose?
*/

public class LogLevels {
    
    public static String message(String logLine) {
        String[] SplitArray = logLine.split(":");
        String ActualReturn = SplitArray[1].trim();

        return ActualReturn;
    }

    public static String logLevel(String logLine) {
        int BeginningIndex = logLine.indexOf("[");
        int EndingIndex = logLine.indexOf("]");
        String LogSub = logLine.substring((BeginningIndex + 1), EndingIndex);
        
        return LogSub.toLowerCase();
    }

    public static String reformat(String logLine) {
        LogLevels hi = new LogLevels();
        String LogMessage = hi.message(logLine);
        String LogLevel = hi.logLevel(logLine);
        String MsgCapital = LogMessage.substring(0, 1).toUpperCase() + LogMessage.substring(1);
        
        return MsgCapital + " (" + LogLevel + ")";
    }
}
