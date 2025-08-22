import express from "express";
const app = express();
const port = process.env.PORT || 3000;

app.get("/", (req, res) => {
  res.json({ message: "Hello from Express in Docker!" });
});

app.listen(port, () => {
  console.log(`Server listening on port ${port}`);
});
