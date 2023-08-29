public class Leetspeak extends Encoder{

    public String encode(String source){
      if(source == null){
        return "";
      }
      StringBuilder builder = new StringBuilder();
      for(char i: source.toCharArray()){
        switch(i){
            case 'a':
            case 'A':
            builder.append('4');
            break;
            case 'e':
            case 'E':
            builder.append('3');
            break;
            case 'l':
            case 'L':
            builder.append('1');
            break;
            case 'm':
            case 'M':
            builder.append("/^^\\");
            break;
            case 'o':
            case 'O':
            builder.append('0');
            break;
            case 'u':
            case 'U':
            builder.append("(_)");
            break;
            default:
            builder.append(i);
        }
      }
      return builder.toString();
    }
  }
  
  abstract class Encoder{
    public abstract String encode(String source);
  }
  
    