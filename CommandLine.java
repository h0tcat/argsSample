public class CommandLine{
    
    // argsがコマンドライン引数を受け取ります 使い方としては、 java CommandLine hello world 
    //この場合、 helloとworldコマンドライン引数になります。

    //ふたつ目のコマンドライン引数を受け取るのであればargs[1]としてやるとworldが取れるはずです。

    //もちろん、コマンドライン引数はhello とworldという値以外も使えます。
    public static void main(String[] args){  //argsがコマンドライン引数を受け取る
        if(args.length!=2){//必ず二個渡さないと使い方が表示される。
            System.out.println("How to use CommandLine.java");
            System.out.println("java CommandLine.java Hello World");
        }else{ //二個引数が渡されたなら
            
            System.out.printf("2個目のコマンドライン引数は %sです。\n",args[1]);
        }
    }
}