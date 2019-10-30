package com.twenty2ndclass;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 命令的集合
    private Stack<Command> commands = new Stack<Command>();
    // 执行
    public void execute() {
        Iterator<Command> it = commands.iterator();
        while (it.hasNext()) {
            it.next().execute();
        }
    }
    // 添加命令
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    // 删除最后一条命令
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    // 删除所有命令
    public void clear() {
        commands.clear();
    }
}
