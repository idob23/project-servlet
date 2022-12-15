package com.tictactoe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Field field = new Field();

        List<Sign> data = field.getFieldData();

        session.setAttribute("field",field);
        session.setAttribute("data",data);

        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
